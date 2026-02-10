# Spring 게시판 CRUD 프로젝트

Spring Boot 기반의 게시판 CRUD 프로젝트입니다.  
MVC 구조를 적용하여 게시글 관리 기능을 구현했으며,  
현재 로그인 / 회원가입 기능을 추가하는 작업을 진행 중입니다.

---

## 🔧 기술 스택

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database
- Thymeleaf
- Gradle
- Git / GitHub

---

## 📌 프로젝트 구조

src/main/java/com/example/gesipan_tacoyakki
├─ board
│ ├─ controller
│ ├─ service
│ ├─ repository
│ └─ domain
│
├─ member
│ ├─ controller
│ ├─ service
│ ├─ repository
│ ├─ domain
│ └─ dto


- **board**: 게시판 관련 기능
- **member**: 회원 / 로그인 기능 (구현 중)

---

## ✅ 구현 완료 기능

### 📄 게시판 (Board)

- 게시글 목록 조회
- 게시글 상세 조회
- 게시글 작성
- 게시글 수정
- 게시글 삭제

---

## 🚧 구현 중인 기능

### 👤 회원 (Member)

- 회원가입
- 로그인
- 게시글 작성 시 사용자 연동
- 인증/인가 구조 설계

---

## 🗄 데이터베이스

- H2 In-Memory Database 사용
- JPA를 통한 ORM 매핑

---

## 📚 학습 목표

- Spring MVC 구조 이해
- Controller / Service / Repository 역할 분리
- JPA 기반 CRUD 구현
- Git & GitHub 협업 흐름 이해
- 로그인 및 인증 로직 기초 이해

---

## 📝 기타

- 본 프로젝트는 학습용 프로젝트입니다.
- 기능은 단계적으로 확장 예정입니다.
