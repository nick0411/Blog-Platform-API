
# 📝 Blog Platform API

A full-featured REST API for a blogging platform built with **Spring Boot**, supporting **JWT authentication**, **role-based access control**, and full CRUD operations for users, posts, comments, and more.

---

## 📌 Features

### 🔐 Authentication & Authorization
- 🔑 JWT-based login/logout
- 🛡️ Role-based access (`USER`, `ADMIN`)
- 🔒 Password hashing with BCrypt
- 🔁 Refresh token (optional)

### 👤 Users
- 🆕 Register, login, update profile
- 🔍 Get user details and their posts

### 📝 Posts
- ✍️ Create, read, update, delete blog posts
- 🏷️ Filter by tag, author, and date
- 📄 Pagination & sorting

### 💬 Comments
- 💭 Comment on posts
- ❌ Delete own comments
- 🧹 Admin moderation

### 🔖 Tags
- 🛠️ Tag creation by admin
- 🔎 Filter posts by tag

### ❤️ Likes
- 👍 Like/unlike posts
- 📊 Get posts liked by a user

### 🛠️ Admin Tools
- 👀 View all users and posts
- 🗑️ Delete any post or comment
- 🚫 Ban users (optional)

---

## 🧠 Tech Stack

| Layer         | Tech                     |
|---------------|--------------------------|
| Language      | Java 17+                 |
| Framework     | Spring Boot 3.x          |
| Security      | Spring Security + JWT    |
| Database      | PostgreSQL / MySQL       |
| ORM           | Spring Data JPA          |
| Build Tool    | Maven / Gradle           |
| Docs          | SpringDoc / Swagger UI   |
| Testing       | JUnit + Mockito (optional) |

---

## 🔄 API Endpoints Overview

### 🧑 Users
```
POST   /api/auth/register       # Register new user  
POST   /api/auth/login          # Login and receive JWT  
GET    /api/users/{id}          # View user profile  
PUT    /api/users/{id}          # Update own profile  
```

### 📝 Posts
```
POST   /api/posts               # Create post (auth required)  
GET    /api/posts               # List all posts (public)  
GET    /api/posts/{id}          # View single post  
PUT    /api/posts/{id}          # Edit post (author/admin)  
DELETE /api/posts/{id}          # Delete post (author/admin)  
```

### 💬 Comments
```
POST   /api/posts/{id}/comments  # Add comment  
GET    /api/posts/{id}/comments  # List comments  
DELETE /api/comments/{id}        # Delete (commenter/admin)  
```

### 🔖 Tags
```
POST   /api/tags               # Create tag (admin only)  
GET    /api/tags               # List all tags  
```

### ❤️ Likes
```
POST   /api/posts/{id}/like     # Like/unlike toggle  
GET    /api/posts/{id}/likes    # View like count  
GET    /api/users/{id}/liked    # Posts liked by user  
```

---

## 🔐 Roles & Permissions

| Role     | Description                          |
|----------|--------------------------------------|
| USER     | Can manage own posts & comments      |
| ADMIN    | Can manage everything (users/posts)  |

Use `@PreAuthorize` or `hasAuthority()` to enforce access control.

---

## 🗃️ Database Schema (Simplified)

```
User
 ├── id
 ├── username
 ├── password
 └── role

Post
 ├── id
 ├── title
 ├── content
 ├── author_id → User
 └── tags (many-to-many)

Comment
 ├── id
 ├── content
 ├── user_id → User
 └── post_id → Post

Tag
 ├── id
 └── name
```

---

## ▶️ Getting Started

### 1. Clone the project
```bash
git clone https://github.com/yourusername/blog-platform-api.git
cd blog-platform-api
```

### 2. Configure `application.yml` or `application.properties`
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/blogdb
    username: postgres
    password: yourpass

jwt:
  secret: your-jwt-secret
  expiration: 3600000
```

### 3. Run the project
```bash
./mvnw spring-boot:run
```

### 4. Access Swagger Docs (if enabled)
```
http://localhost:8080/swagger-ui.html
```

---

## 🧪 Optional TODOs

- [ ] 🔁 Add refresh token endpoint  
- [ ] 📧 Email verification on signup  
- [ ] 🗃️ Soft delete with `@SQLDelete`  
- [ ] 🧪 Integration tests with JUnit  
- [ ] 🐳 Docker support  

---

## 👨‍💻 Author

**Nick** – [GitHub](https://github.com/nick0411)

---

## 📄 License

This project is licensed under the MIT License. See the `LICENSE` file for details.
