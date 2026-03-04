# Checklist Phát triển: TickTick Lite

Bảng theo dõi tiến độ xây dựng ứng dụng từ Backend đến UI.

---

## 🏗️ Phase 1: Hạ tầng & Backend (MongoDB Atlas)
- [ ] **MongoDB Atlas:**
    - [ ] Tạo Cluster trên MongoDB Atlas.
    - [ ] Cấu hình Database (`ticktick_db`) và Collections (`users`, `tasks`, `categories`).
    - [ ] Thiết lập Database Access (Username/Password) và Network Access (IP Whitelist).
- [ ] **Backend API (Node.js/Express hoặc Ktor):**
    - [ ] API Đăng ký/Đăng nhập (JWT Auth).
    - [ ] API CRUD cho Task: `GET /tasks`, `POST /tasks`, `PUT /tasks/:id`, `DELETE /tasks/:id`.
    - [ ] API CRUD cho Category.
    - [ ] Triển khai lên server (Render/Heroku/Vercel) hoặc chạy Local.

---

## 📱 Phase 2: Cấu trúc Project Android
- [ ] **Thiết lập ban đầu:**
    - [ ] Khởi tạo Project Android (Kotlin + Jetpack Compose).
    - [ ] Cấu hình `build.gradle` (Hilt, Retrofit, Room, Compose dependencies).
- [ ] **Lớp Dữ liệu (Data Layer):**
    - [ ] Định nghĩa Room Entities cho Local Storage.
    - [ ] Định nghĩa Data Transfer Objects (DTOs) cho Network.
    - [ ] Xây dựng Repository Pattern: Tự động điều phối giữa Local (Room) và Remote (API).
- [ ] **Dependency Injection:** Cài đặt Hilt Module cho Database và Network.

---

## 🎨 Phase 3: UI/UX & Tài nguyên (Assets)
- [ ] **Typography & Fonts:**
    - [ ] Import font chữ: **Geomanist-Regular.ttf** và **Geomanist-Medium.ttf** vào thư mục `res/font`.
    - [ ] Định nghĩa `Type.kt` trong Compose (Sử dụng `FontFamily` cho Geomanist).
- [ ] **Colors & Theme:**
    - [ ] Định nghĩa Palette màu (Blue primary, Priority colors: Red/Orange/Yellow).
    - [ ] Cấu hình Light/Dark Mode.
- [ ] **Assets & Icons:**
    - [ ] Sử dụng hệ thống **Google Material Icons (Rounded)**.
    - [ ] Chuẩn bị Logo app (Adaptive Icon).
    - [ ] (Optional) Thêm Lottie animation cho hiệu ứng khi hoàn thành task.

---

## 🛠️ Phase 4: Xây dựng Giao diện (Compose Screens)
- [ ] **Navigation:** Thiết lập Compose Navigation (Bottom Bar + Navigation Drawer).
- [ ] **Màn hình Danh sách (Task List):**
    - [ ] List hiển thị theo ngày (Today, Tomorrow).
    - [ ] Swipe-to-delete (Vuốt để xóa).
    - [ ] Quick-add bar (Thêm nhanh ở cạnh dưới).
- [ ] **Màn hình Lịch (Calendar View):**
    - [ ] Giao diện Timeline dọc (Vertical Timeline).
    - [ ] Hiển thị Task dưới dạng Card (Time blocks).
    - [ ] Logic chuyển đổi ngày/tháng.
- [ ] **Màn hình Chi tiết (Task Detail):** Sửa tên, ghi chú, đặt giờ, chọn category.

---

## 🔄 Phase 5: Tính năng Nâng cao & Đồng bộ
- [ ] **Sync Engine:** Logic tự động đẩy dữ liệu lên MongoDB khi có internet.
- [ ] **Thông báo (Notifications):**
    - [ ] Cài đặt AlarmManager để nhắc nhở task.
    - [ ] Tích hợp Firebase Cloud Messaging (FCM) cho thông báo từ server.
- [ ] **Xử lý Offline:** Đảm bảo app không bị crash và lưu task tạm thời khi mất mạng.

---

## 🧪 Phase 6: Kiểm thử & Hoàn thiện
- [ ] Kiểm tra hiển thị trên các kích thước màn hình khác nhau.
- [ ] Fix lỗi xung đột dữ liệu khi sync.
- [ ] Tối ưu hóa tốc độ tải dữ liệu (Pagination).
