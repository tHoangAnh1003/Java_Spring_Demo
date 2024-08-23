# Spring Boot Project Demo

## Mô tả
Đây là một dự án demo sử dụng Spring Boot để phát triển ứng dụng web với Java. Dự án này được thiết kế để chạy trên Apache Maven, Tomcat và MySQL.

## Yêu cầu hệ thống
- Apache Maven 3.6.0
- Tomcat 8
- MySQL 8.0.34
- Java 8

## Cài đặt
1. **Tải về và cấu hình cơ sở dữ liệu:**
   - Tải về file cơ sở dữ liệu từ folder `Database`.
   - Import cơ sở dữ liệu vào MySQL của bạn.

2. **Cấu hình ứng dụng:**
   - Mở file `application-dev.properties` và chỉnh sửa các thông tin sau để phù hợp với cấu hình MySQL trên máy của bạn:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ten_database_cua_ban
     spring.datasource.username=ten_nguoi_dung
     spring.datasource.password=mat_khau
     ```
   - Mở file `ConnectionUtil.java` và chỉnh sửa các thông tin sau:
     ```java
     private static final String DB_URL = "jdbc:mysql://localhost:3306/ten_database_cua_ban";
     private static final String USER = "ten_nguoi_dung";
     private static final String PASS = "mat_khau";
     ```

3. **Cấu hình cổng server (tuỳ chọn):**
   - Nếu bạn muốn thay đổi cổng chạy ứng dụng, hãy mở file `application.properties` và chỉnh sửa:
     ```properties
     server.port=9090
     ```
   - Thay đổi `9090` thành cổng bạn muốn sử dụng.

## Chạy ứng dụng
1. Mở Eclipse hoặc IDE bạn đang sử dụng.
2. Tìm đến file `Application.java`.
3. Nhấp chuột phải vào file và chọn `Run As` -> `Spring Boot App` hoặc `Java Application`.

Ứng dụng của bạn sẽ được khởi động trên Tomcat với cổng được cấu hình trước đó.
