# Requirements: TickTick Lite

## 1. Giới thiệu Project
Xây dựng một ứng dụng quản lý công việc cá nhân (To-do List) tinh gọn, tập trung vào trải nghiệm người dùng cục bộ (Local-first), kết hợp giao diện lịch trình (Calendar) tương tự Google Calendar để tối ưu hóa việc quản lý thời gian trên di động.

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

### C. Lưu trữ Dữ liệu (Local Storage)
*   **Database cục bộ:** Sử dụng SQLite (Room Database) để lưu trữ toàn bộ dữ liệu trên thiết bị.
*   **Tốc độ:** Truy cập dữ liệu tức thì, không phụ thuộc vào kết nối mạng.
*   **Bảo mật:** Dữ liệu nằm hoàn toàn trên thiết bị của người dùng.

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
*   **Local Database:** **Room Database** (Lưu trữ chính).
*   **Architecture:** MVVM (Model - View - ViewModel) + Clean Architecture.
*   **Dependency Injection:** Hilt.
*   **Async Processing:** Kotlin Coroutines & Flow.

## 5. Dữ liệu (Data Model - Task)
```kotlin
data class Task(
    val id: Int = 0,            // Primary Key tự tăng
    val title: String,
    val note: String?,
    val dueDate: Long?,         // Timestamp ngày hết hạn
    val startTime: Long?,       // Timestamp bắt đầu (cho Calendar)
    val endTime: Long?,         // Timestamp kết thúc (cho Calendar)
    val priority: Priority,     // HIGH, MEDIUM, LOW, NONE
    val categoryId: Int?,       // Foreign Key đến Category
    val isCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)
```

## 6. Lộ trình Phát triển (Roadmap)
1.  **Phase 1:** Thiết lập cấu trúc Project Android và Cài đặt Room Database.
2.  **Phase 2:** Xây dựng tính năng CRUD Task với Room.
3.  **Phase 3:** Thiết kế UI/UX (Fonts, Icons, Themes) và Navigation.
4.  **Phase 4:** Xây dựng giao diện List View và Calendar View (Vertical Timeline).
5.  **Phase 5:** Tối ưu hóa tính năng (Notifications, Search) và Hoàn thiện.
