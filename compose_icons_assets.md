\# 🎨 Jetpack Compose Material Icons Assets

\*\*Project:\*\* To-Do App UI Clone

\*\*Dependency Requirement:\*\* `implementation("androidx.compose.material:material-icons-extended:<version>")`



---



\## 1. Sidebar Navigation (Thanh Menu Trái)

\*Khu vực điều hướng chính của ứng dụng.\*



\* \*\*Task/To-do:\*\* `Icons.Outlined.TaskAlt` hoặc `Icons.Outlined.CheckBox`

\* \*\*Lịch:\*\* `Icons.Outlined.CalendarMonth` hoặc `Icons.Outlined.CalendarToday`

\* \*\*Mục tiêu (Bia ngắm):\*\* `Icons.Outlined.TrackChanges` hoặc `Icons.Outlined.Adjust`

\* \*\*Đồng hồ/Pomodoro:\*\* `Icons.Outlined.Schedule` hoặc `Icons.Outlined.AccessTime`

\* \*\*Dashboard/Grid:\*\* `Icons.Outlined.GridView` hoặc `Icons.Outlined.Dashboard`

\* \*\*Tìm kiếm:\*\* `Icons.Outlined.Search`

\* \*\*Đồng bộ/Refresh:\*\* `Icons.Outlined.Sync` hoặc `Icons.Outlined.Autorenew`

\* \*\*Thông báo:\*\* `Icons.Outlined.Notifications`

\* \*\*Trợ giúp/Hỗ trợ:\*\* `Icons.Outlined.HelpOutline`



\## 2. Lists \& Filters (Cột Danh sách Menu)

\*Các bộ lọc và danh sách công việc phân loại.\*



\* \*\*Today (Lịch ngày):\*\* `Icons.Outlined.CalendarToday`

\* \*\*Next 7 Days:\*\* `Icons.Outlined.DateRange`

\* \*\*Inbox (Hộp thư):\*\* `Icons.Outlined.Inbox`

\* \*\*Work Tasks (Laptop):\*\* `Icons.Outlined.LaptopMac` hoặc `Icons.Outlined.Computer`

\* \*\*Study Goals (Sách):\*\* `Icons.Outlined.MenuBook`

\* \*\*Travel Plans (Máy bay):\*\* `Icons.Outlined.Flight`

\* \*\*Completed (Đã hoàn thành):\*\* `Icons.Outlined.CheckBox`

\* \*\*Unscheduled (Chưa lên lịch):\*\* `Icons.Outlined.Inventory2` hoặc `Icons.Outlined.PendingActions`



> 💡 \*\*Note:\*\* Các mục như \*Life Errands\* (Cầu vồng) hay \*Daily To-Dos\* (Phi tiêu) trong thiết kế gốc sử dụng System Emoji. Trong Compose, có thể dùng `Text(text = "🌈")` thay vì gọi Material Icon.



\## 3. Main Task List (Cột Danh sách Công việc)

\*Khu vực hiển thị danh sách task cụ thể.\*



\* \*\*Sắp xếp (Cạnh tiêu đề):\*\* `Icons.Outlined.Sort` hoặc `Icons.Outlined.FilterList`

\* \*\*Nút tùy chọn (3 chấm):\*\* `Icons.Outlined.MoreHoriz`

\* \*\*Nút Thêm công việc (+):\*\* `Icons.Outlined.Add`

\* \*\*Ô Checkbox rỗng:\*\* `Icons.Outlined.CheckBoxOutlineBlank`

\* \*\*Giờ nhắc nhở:\*\* `Icons.Outlined.Alarm`

\* \*\*Đính kèm tệp:\*\* `Icons.Outlined.AttachFile`



\## 4. Task Details (Cột Chi tiết Công việc)

\*Màn hình thông tin chi tiết của một task.\*



\* \*\*Cắm cờ ưu tiên:\*\* `Icons.Outlined.Flag`

\* \*\*Danh sách sub-task:\*\* `Icons.Outlined.FormatListBulleted` hoặc `Icons.Outlined.Notes`



\## 5. Mobile UI Specifics (Giao diện Mobile)

\*Các icon đặc thù chỉ xuất hiện trên layout điện thoại.\*



\* \*\*Menu mở rộng (Góc trái trên):\*\* `Icons.Outlined.ViewDay` hoặc `Icons.Outlined.TableRows`

\* \*\*Nút FAB (+):\*\* `Icons.Filled.Add` \*(Dùng bản Filled để nổi bật khối màu)\*

\* \*\*Cài đặt (Tab bar):\*\* `Icons.Outlined.Settings`



---

\*\*Ví dụ cách gọi trong Code:\*\*

```kotlin

Icon(

&nbsp;   imageVector = Icons.Outlined.CalendarMonth,

&nbsp;   contentDescription = "Calendar Icon",

&nbsp;   tint = Color.Gray

)

