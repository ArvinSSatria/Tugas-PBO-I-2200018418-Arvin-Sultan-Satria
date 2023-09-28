#include <iostream>
using namespace std;

// Main program
int main() {
    // Deklarasi variabel dan tipe data
    int angka = 10;
    float pecahan = 3.14;
    char karakter = 'A';

    // Output
    cout << "Variabel dan Tipe Data:" << endl;
    cout << "Angka: " << angka << endl;
    cout << "Pecahan: " << pecahan << endl;
    cout << "Karakter: " << karakter << endl;

    // Array satu dimensi
    int arraySatuDimensi[5] = {1, 2, 3, 4, 5};

    cout << "\nArray Satu Dimensi:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << "Elemen " << i << ": " << arraySatuDimensi[i] << endl;
    }

    // Array multidimensi dan for
    int arrayMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};

    cout << "\nArray Multidimensi:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            cout << "Elemen " << i << "," << j << ": " << arrayMultiDimensi[i][j] << endl;
        }
    }

    // Penggunaan if dan for
    int nilai = 85;

    if (nilai >= 60) {
        cout << "\nAnda lulus!" << endl;
    } else {
        cout << "\nAnda tidak lulus." << endl;
    }

    // Penggunaan while
    int counter = 0;
    while (counter < 5) {
        cout << "\nNilai counter: " << counter << endl;
        counter++;
    }

    cout << endl;
    // Penggunaan do while
    int bilangan = 1;
    do {
        cout << "Bilangan: " << bilangan << endl;
        bilangan++;
    } while (bilangan <= 5);

    // Input
    int inputAngka;
    cout << "\nMasukkan sebuah angka: ";
    cin >> inputAngka;
    cout << "Anda memasukkan: " << inputAngka << endl;

    // Komentar
    // Ini adalah komentar satu baris
    /*
    Ini adalah komentar
    beberapa baris
    */

    return 0;
}