import java.util.Scanner;
import java.util.UUID;

import static until.UntilScaner.SCANNER;

public class Student {
    private String id;
    private String name;
    private String address;
    private int number;
    private String email;

    public Student() {
        this.id = UUID.randomUUID().toString();
    }

    public Student(String name, String address, int number, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudent() {
        System.out.printf("Nhap ten sinh vien: ");
        this.name = SCANNER.nextLine();
        System.out.printf("Nhap dia chi cua sinh vien: ");
        this.address = SCANNER.nextLine();
        System.out.printf("Nhap so dien thoai cua sinh vien: ");
        this.number = Integer.parseInt(SCANNER.nextLine());
        System.out.printf("Nhap dia chi email cua sinh vien: ");
        this.email = SCANNER.nextLine();

    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }

}
