# Requirements: TickTick Lite

## 1. Giới thiệu Project
Xây dựng một ứng dụng quản lý công việc cá nhân (To-do List) tinh gọn, kết hợp giao diện lịch trình (Calendar) tương tự Google Calendar để tối ưu hóa việc quản lý thời gian trên di động. Ứng dụng hỗ trợ đồng bộ hóa dữ liệu đám mây thông qua MongoDB Atlas.

## 2. Các Tính năng Chính (Core Features)

### A. Quản lý Danh sách Công việc (To-Do List)
*   **Thêm Task mới:** Nhập tên công việc, ghi chú, và chọn danh mục.
*   **Check-off:** Đánh dấu hoàn thành công việc trực tiếp từ danh sách.
*   **Phân loại thời gian:** 
    *   *Today:* Các việc cần làm trong ngày.
    *   *Next 7 Days:* Lịch trình trong tuần tới.
    *   *Inbox:* Các việc chưa phân loại ngày tháng.
*   **Danh sách tùy chỉnh (Lists):** Tạo các thư mục như Work, Study, Personal để nhóm công việc.
*   **Độ ưu tiên (Priority):** Gắn nhãn mức độ quan trọng (Cao, Trung bình, Thấp) bằng màu sắc.

### B. Lịch trình (Calendar View)
*   **Giao diện Timeline:** Hiển thị công việc dưới dạng các khối thời gian (Time Blocks) theo giờ trong ngày.
*   **Đồng bộ Task:** Mọi task có set thời gian cụ thể sẽ tự động xuất hiện trên lịch.
*   **Thao tác nhanh:** Chạm vào khoảng trống trên lịch để tạo nhanh task vào khung giờ đó.

### C. Đồng bộ hóa & Người dùng (Cloud Sync)
*   **Tài khoản:** Đăng ký/Đăng nhập để lưu trữ dữ liệu.
*   **Đồng bộ Cloud:** Tự động đồng bộ dữ liệu giữa thiết bị di động và Server (MongoDB Atlas).
*   **Chế độ Offline:** Cho phép làm việc khi không có mạng và tự động sync khi có kết nối trở lại.

## 3. Giao diện Người dùng (UI/UX) - Design System
*   **Typography (Phông chữ):** Sử dụng bộ font **Geomanist** cao cấp:
    *   `Geomanist-Regular.ttf`: Cho nội dung văn bản, ghi chú.
    *   `Geomanist-Medium.ttf`: Cho tiêu đề, nhãn (labels), và các mục quan trọng.
*   **Iconography (Biểu tượng):** Sử dụng hệ thống **Google Material Icons** (Rounded/Outlined) để đảm bảo tính nhất quán và chuyên nghiệp.
*   **Ngôn ngữ thiết kế:** Hiện đại, sạch sẽ (Clean UI), sử dụng tông màu sáng/tối (Light/Dark Mode).
*   **Navigation:**
    *   Bottom Navigation hoặc Sidebar để chuyển đổi giữa màn hình **List** và **Calendar**.
    *   Floating Action Button (FAB) (+) để thêm task nhanh.

## 4. Công nghệ Đề xuất (Tech Stack)
*   **Ngôn ngữ:** Kotlin.
*   **UI Framework:** Jetpack Compose (Modern Toolkit).
*   **Local Cache:** Room Database (Lưu trữ tạm thời khi offline).
*   **Remote Database:** **MongoDB Atlas** (Lưu trữ chính trên Server).
*   **API & Networking:** Retrofit hoặc Ktor Client (Giao tiếp RESTful API).
*   **Backend Interface:** Node.js/Express hoặc Kotlin Ktor (Làm trung gian giữa Android và MongoDB).
*   **Architecture:** MVVM (Model - View - ViewModel).
*   **Dependency Injection:** Hilt.
*   **Async Processing:** Kotlin Coroutines & Flow.

## 5. Dữ liệu (Data Model - Task)
```kotlin
data class Task(
    val id: String,             // ID từ MongoDB (_id)
    val userId: String,         // Liên kết với người dùng
    val title: String,
    val note: String?,
    val dueDate: Long?,         // Timestamp ngày hết hạn
    val startTime: Long?,       // Timestamp bắt đầu (cho Calendar)
    val endTime: Long?,         // Timestamp kết thúc (cho Calendar)
    val priority: Priority,     // HIGH, MEDIUM, LOW, NONE
    val categoryId: String,
    val isCompleted: Boolean = false,
    val updatedAt: Long         // Dùng để kiểm tra đồng bộ
)
```

## 6. Lộ trình Phát triển (Roadmap)
1.  **Phase 1:** Thiết lập cấu trúc Project, Backend API kết nối MongoDB Atlas.
2.  **Phase 2:** Xây dựng tính năng CRUD Task cơ bản và đồng bộ hóa Room-Server.
3.  **Phase 3:** Xây dựng giao diện Calendar View (Vertical Timeline).
4.  **Phase 4:** Tích hợp xác thực người dùng (Auth) và Notifications.
5.  **Phase 5:** Tối ưu hóa UI/UX và xử lý xung đột dữ liệu (Conflict Resolution).
