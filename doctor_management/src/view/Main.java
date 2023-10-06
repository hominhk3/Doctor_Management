/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.DoctorManagement;
import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> ld = new ArrayList<>();
        while (true) {
            int choice = DoctorManagement.menu();
            switch (choice) {
                case 1:
                    DoctorManagement.addDoctor(ld);
                    break;
                case 2:
                    DoctorManagement.updateDoctor(ld);
                    break;
                case 3:
                    DoctorManagement.deleteDoctor(ld);
                    break;
                case 4:
                    DoctorManagement.searchDoctor(ld);
                    break;
                case 5:
                    return;
            }

        }

    }
}
