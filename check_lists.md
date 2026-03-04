# Checklist Phát triển: TickTick Lite (Local Database Version)

Bảng theo dõi tiến độ xây dựng ứng dụng sử dụng Room Database làm bộ lưu trữ chính.

---

## 🏗️ Phase 1: Hạ tầng & Cấu trúc Project
- [x] **Khởi tạo Project Android:**
    - [x] Khởi tạo Project (Kotlin + Jetpack Compose).
    - [x] Cấu hình `build.gradle` (Hilt, Room, Compose dependencies).
- [x] **Lớp Dữ liệu (Room Database):**
    - [x] Định nghĩa Entities (`Task`, `Category`).
    - [x] Xây dựng DAOs (Data Access Objects) cho CRUD operations.
    - [x] Cấu hình Room Database class.
- [x] **Dependency Injection:** Cài đặt Hilt cho Database.

---

## 🎨 Phase 2: UI/UX & Tài nguyên (Assets)
- [ ] **Typography & Fonts:**
    - [ ] Import font chữ: **Geomanist-Regular.ttf** và **Geomanist-Medium.ttf** vào thư mục `res/font`.
    - [ ] Định nghĩa `Type.kt` (FontFamily Geomanist).
- [ ] **Colors & Theme:**
    - [ ] Định nghĩa Palette màu (Blue primary, Priority colors).
    - [ ] Cấu hình Light/Dark Mode.
- [ ] **Assets & Icons:**
    - [ ] Tích hợp Google Material Icons.
    - [ ] Chuẩn bị Logo app.

---

## 🛠️ Phase 3: Core Features (MVVM)
- [ ] **Navigation:** Thiết lập Compose Navigation (Bottom Bar / Sidebar).
- [ ] **Repository:** Implement Task & Category repositories.
- [ ] **Task Management:**
    - [ ] Logic thêm/sửa/xóa task.
    - [ ] Đánh dấu hoàn thành.
    - [ ] Phân loại theo Today/Next 7 Days.

---

## 📱 Phase 4: Xây dựng Giao diện (Compose Screens)
- [ ] **Màn hình Danh sách (Task List):**
    - [ ] Giao diện danh sách theo ngày.
    - [ ] Swipe-to-delete.
    - [ ] Quick-add bar.
- [ ] **Màn hình Lịch (Calendar View):**
    - [ ] Vertical Timeline view.
    - [ ] Hiển thị Time blocks.
- [ ] **Màn hình Chi tiết (Task Detail):** Form chỉnh sửa đầy đủ.

---

## 🔄 Phase 5: Tính năng Nâng cao & Hoàn thiện
- [ ] **Thông báo (Notifications):** Cài đặt AlarmManager nhắc nhở.
- [ ] **Tìm kiếm & Bộ lọc:** Tìm kiếm task theo tên hoặc category.
- [ ] **Backup/Restore:** (Optional) Xuất/Nhập dữ liệu cục bộ.
- [ ] **Tối ưu hóa:** Fix lỗi hiển thị và cải thiện hiệu năng.
