import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của ma trận A và B
        System.out.print("Nhập số dòng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Khởi tạo hai ma trận A và B
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        // Nhập giá trị cho ma trận A
        System.out.println("Nhập giá trị cho ma trận A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Nhập giá trị cho ma trận B
        System.out.println("Nhập giá trị cho ma trận B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Kiểm tra số dòng và số cột của hai ma trận
        if (rows != columns) {
            System.out.println("Không thể thực hiện phép cộng vì số dòng và số cột của hai ma trận không bằng nhau.");
        } else {
            // Tính tổng của hai ma trận và lưu kết quả vào ma trận C
            int[][] matrixC = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            // Hiển thị kết quả tổng ma trận
            System.out.println("Ma trận A:");
            displayMatrix(matrixA);
            System.out.println("Ma trận B:");
            displayMatrix(matrixB);
            System.out.println("Tổng của hai ma trận:");
            displayMatrix(matrixC);
        }

        scanner.close();
    }

    // Hiển thị ma trận
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
