package com.ssafy.backend.domain.admin.controller;

import com.ssafy.backend.domain.admin.model.service.AdminService;
import com.ssafy.backend.domain.user.entity.User;
import com.ssafy.backend.domain.user.model.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@PreAuthorize("hasAnyRole('ADMIN')")  // 클래스 레벨에서 한 번만 선언
@Tag(name = "관리자 기능 API", description = "관리자 전용 API를 제공하는 컨트롤러입니다.")
public class AdminController {
    private final AdminService adminService;
    private final UserService userService;

    @Operation(
            summary = "유저 서비스 활성화",
            description = "이메일로 유저의 서비스 활성여부 결정"
    )
    @PutMapping("/users/{email}/activate")
    public ResponseEntity<String> activateUser(@PathVariable String email) {
        adminService.activateUser(email);

        return ResponseEntity.ok(email + " 유저 활성화 완료");
    }

    @Operation(
            summary = "유저 서비스 비활성화",
            description = "이메일로 유저의 서비스 활성여부 결정"
    )
    @PutMapping("/users/{email}/deactivate")
    public ResponseEntity<String> deactivateUser(@PathVariable String email) {
        adminService.deactivateUser(email);

        return ResponseEntity.ok(email + " 유저 비활성화 완료");
    }

    @Operation(
            summary = "유저 계정 삭제",
            description = "이메일로 해당 유저의 정보 삭제"
    )
    @DeleteMapping("/users/{email}")
    public ResponseEntity<String> deleteUser(@PathVariable String email) {
        adminService.deleteUser(email);

        return ResponseEntity.ok(email + " 유저 삭제 완료");
    }

    @Operation(
            summary = "유저 권한 설정",
            description = "이메일로 유저의 권한 업데이트 : user, admin 둘 중에 하나 선택"
    )
    @PutMapping("/users/{email}/role")
    public ResponseEntity<String> updateRole(@PathVariable String email, @RequestBody String role) {
        String formattedRole = "ROLE_" + role.toUpperCase();
        adminService.updateUserRole(email, formattedRole);
        return ResponseEntity.ok(email + " 유저 역할 변경 완료");
    }

    @Operation(
            summary = "전체 유저 조회",
            description = "모든 유저의 리스트를 조회"
    )
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = adminService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @Operation(
            summary = "사용자 검색 [관리자 기능]",
            description = "이메일 입력 시 해당 유저의 정보 반환"
    )
    @GetMapping("/info/{email}")
    public ResponseEntity<User> getUserInfo(@PathVariable String email) {
        return userService.getUserWithAuthorities(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());  // 유저를 찾지 못할 경우 404 반환
    }
}