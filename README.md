## Identitas
- Nama  : Ismi Zakia
- NPM  : 2210010020
- Kelas  : 5B Non Reguler Banjarmasin
# CheckNumberApp

**CheckNumberApp** adalah aplikasi berbasis GUI (Graphical User Interface) untuk memeriksa apakah sebuah angka adalah:
1. **Bilangan Genap atau Ganjil**.
2. **Bilangan Prima atau Bukan Prima**.

## Fitur

- **Validasi Input**:
  - Hanya angka yang dapat dimasukkan ke dalam aplikasi.
- **Cek Genap/Ganjil**:
  - Menentukan apakah angka yang dimasukkan adalah bilangan genap atau ganjil.
- **Cek Bilangan Prima**:
  - Menentukan apakah angka yang dimasukkan merupakan bilangan prima.
- **Antarmuka Pengguna Sederhana**:
  - Input angka dan tombol untuk memeriksa hasil.

## Prasyarat

- **Java Development Kit (JDK)** versi 8 atau lebih baru.

## Cara Menjalankan

1. **Kloning atau unduh proyek ini.**
2. **Kompilasi dan Jalankan Program**:
   - Di terminal:
     ```bash
     javac CheckNumberApp.java
     java CheckNumberApp
     ```
   - Di IDE seperti NetBeans atau IntelliJ:
     - Buka proyek, temukan file `CheckNumberApp.java`, dan jalankan.

## Struktur Antarmuka

1. **Field Input**:
   - Pengguna memasukkan angka pada kotak teks.
2. **Tombol "Cek"**:
   - Klik tombol ini untuk melihat hasil analisis angka.
3. **Hasil Output**:
   - Hasil akan ditampilkan di bagian bawah jendela GUI.

## Penjelasan Kode

### Komponen Utama
1. **JTextField**:
   - Komponen input untuk memasukkan angka.
   - Validasi dilakukan agar hanya angka yang dapat dimasukkan.
2. **JButton**:
   - Tombol untuk memulai analisis angka.
3. **JLabel**:
   - Menampilkan hasil analisis.
4. **KeyListener**:
   - Membatasi input agar hanya menerima angka.
5. **FocusListener**:
   - Menghapus input saat kotak teks mendapatkan fokus.

### Metode Analisis
1. **Genap/Ganjil**:
   - Menggunakan modulus (`%`) untuk menentukan bilangan genap atau ganjil.
2. **Bilangan Prima**:
   - Metode `isPrime` memeriksa apakah angka memiliki pembagi selain 1 dan dirinya sendiri.

## Contoh Penggunaan

1. Jalankan aplikasi.
2. Masukkan angka pada kotak teks.
3. Tekan tombol **Cek**.
4. Hasil analisis angka akan ditampilkan dalam format berikut:
   - **Angka 7 adalah Ganjil dan Prima.**
   - **Angka 10 adalah Genap dan Bukan Prima.**
