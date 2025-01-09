# Kiểm Thử Nâng Cao với JUnit

## Giới Thiệu

Dự án này bao gồm các thuật toán thông dụng và cấu trúc dữ liệu cơ bản trong Java, đồng thời áp dụng **JUnit** để kiểm thử. Mục tiêu là nâng cao kỹ năng kiểm thử phần mềm thông qua việc viết và kiểm tra các thuật toán. 

## Nội Dung

### 1. Thuật Toán
- **Bubble Sort**: Sắp xếp mảng bằng thuật toán Bubble Sort.
- **Binary Search**: Tìm kiếm nhị phân trên mảng đã sắp xếp.
- **Binary Tree**: Cây nhị phân với các phương thức duyệt thứ tự (trung, trước, sau).
- **Merge Sort**: Sắp xếp danh sách liên kết đơn bằng thuật toán Merge Sort.

### 2. Kiểm Thử JUnit
- Kiểm tra tính chính xác của các thuật toán và xử lý ngoại lệ (nếu có).
- Bao gồm các trường hợp kiểm thử với mảng, cây, và danh sách liên kết trong các tình huống khác nhau.

## Cấu Trúc Dự Án

src/ ├── Sorting.java # Thuật toán Bubble Sort ├── Search.java # Thuật toán tìm kiếm nhị phân ├── BinaryTree.java # Cây nhị phân và các phương thức duyệt ├── LinkedListSort.java # Sắp xếp danh sách liên kết bằng Merge Sort └── AlgorithmsTest.java # Kiểm thử JUnit cho các thuật toán

## Hướng Dẫn Sử Dụng

### 1. Chạy Thuật Toán
- Mở các file `Sorting.java`, `Search.java`, `BinaryTree.java`, hoặc `LinkedListSort.java`.
- Viết code trong phương thức `main` hoặc tích hợp vào hệ thống của bạn để chạy và kiểm tra.

### 2. Chạy Kiểm Thử
1. Đảm bảo bạn đã cài đặt **JUnit 5**.
2. Chạy file `AlgorithmsTest.java` trong môi trường phát triển (IntelliJ IDEA, Eclipse) hoặc sử dụng Maven/Gradle.

Cài Đặt JUnit
Nếu sử dụng Maven, thêm đoạn sau vào file pom.xml:
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.0</version>
    <scope>test</scope>
</dependency>
Nếu sử dụng Gradle, thêm đoạn sau vào file build.gradle:
testImplementation 'org.junit.jupiter:junit-jupiter:5.9.0'

}
