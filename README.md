# Laporan Tugas Kuliah Pemrograman Berorientasi Objek - Pertemuan Kesebelas

Disusun guna memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek**.

---

## Dosen Pembimbing
Bayu Adhi Nugroho, Ph.D

## Disusun Oleh
Muhamad Dhauvir Arkan (09020624044)

**Program Studi:** Sistem Informasi  
**Fakultas:** Sains dan Teknologi  
**Universitas:** Universitas Islam Negeri Sunan Ampel, Surabaya  
**Tahun:** 2025

---

## 1. Latar Belakang
Perkembangan teknologi informasi menuntut pengembangan aplikasi yang mampu mengelola data dengan efisien, aman, dan terstruktur. Dalam pengembangan aplikasi berbasis Java, pengelolaan data dari database relasional menjadi salah satu tantangan utama, terutama terkait dengan konsistensi, kemudahan pemrograman, dan integrasi dengan antarmuka pengguna.

Java Persistence API (JPA) hadir sebagai solusi untuk mempermudah pengelolaan data melalui konsep **Object-Relational Mapping (ORM)**. Dengan JPA, pengembang dapat memetakan kelas Java menjadi tabel database, sehingga operasi CRUD (Create, Read, Update, Delete) dapat dilakukan melalui objek Java tanpa menulis perintah SQL secara manual. Hal ini mempermudah pengembangan aplikasi, mengurangi potensi kesalahan, dan meningkatkan produktivitas.

GUI berbasis **Java Swing** menyediakan antarmuka yang intuitif untuk menampilkan data dalam bentuk tabel dan mengelola data melalui tombol-tombol aksi seperti Insert, Update, Delete, Upload CSV, dan Cetak laporan.

**JasperReports** digunakan untuk membuat laporan otomatis dari database yang dapat diisi parameter dinamis dan dicetak dalam format yang mudah dibaca. Integrasi JPA dengan JasperReports memungkinkan data langsung diolah menjadi laporan, mendukung pengambilan keputusan yang cepat dan tepat.

Praktikum ini bertujuan memberikan pengalaman langsung dalam implementasi JPA, GUI Swing, dan laporan, sehingga mahasiswa dapat memahami alur kerja aplikasi berbasis database secara utuh.

---

## 2. Dasar Teori

### a. Pengertian JPA
Java Persistence API (JPA) adalah spesifikasi Java untuk mengelola data relasional melalui objek Java. JPA memudahkan pemrogram untuk melakukan **Object-Relational Mapping (ORM)**, sehingga operasi database seperti CRUD dapat dilakukan melalui objek Java tanpa SQL manual.

### b. Konsep Entity dan EntityManager
- **Entity:** Kelas Java yang dipetakan ke tabel database menggunakan anotasi `@Entity`.  
- **Primary Key:** Atribut kunci primer menggunakan `@Id`.  
- **EntityManager:** Mengatur lifecycle entity dan operasi `persist`, `merge`, `remove`, `find`.  
- **Persistence Unit:** Nama unit persistence (`DepokeretasbiPU`) menghubungkan EntityManager dengan konfigurasi database (`persistence.xml`).

### c. CRUD Menggunakan JPA dalam GUI Swing
- **Insert:** Menambahkan entity baru menggunakan `em.persist()`.  
- **Update:** Memodifikasi entity dengan `em.find()` dan commit transaksi.  
- **Delete:** Menghapus entity dengan `em.remove()`.  
- **Read/Load Data:** Menampilkan seluruh data entity di `JTable`.

### d. Integrasi CSV
File CSV dapat diunggah melalui `JFileChooser` untuk membaca data eksternal sebelum disimpan ke database.

### e. Integrasi JasperReports
- Template `.jrxml` dikompilasi menjadi `.jasper`.  
- `JasperFillManager.fillReport()` mengisi laporan dengan data melalui koneksi JDBC.  
- Laporan ditampilkan menggunakan `JasperViewer.viewReport()`.  
- Parameter laporan dapat dikirim melalui `Map<String, Object>`.

### f. Manfaat Praktikum
- Memahami konsep ORM dan JPA secara praktis.  
- Mengelola entity menggunakan EntityManager dan transaksi.  
- Mengintegrasikan GUI Swing untuk interaksi pengguna.  
- Menampilkan data secara dinamis di `JTable`.  
- Menghasilkan laporan otomatis menggunakan JasperReports.  
- Mengelola file eksternal (CSV) untuk input data.

### g. Kesimpulan Konseptual
Praktikum ini menekankan:  
- Pengelolaan data database melalui JPA.  
- Penggunaan transaksi untuk menjamin integritas data.  
- Integrasi antara GUI, database, dan reporting tools.  
- Pemisahan logika aplikasi (Java) dan presentasi data (JTable & JasperReports).

---

## 3. Pelaksanaan Praktikum
1. Membuat Java Class **`TugasPert11`**.  
2. Membuat **Entity Classes from Databases** melalui menu New → Entity Classes from Databases.
<img width="597" height="368" alt="Screenshot 2025-10-31 004017" src="https://github.com/user-attachments/assets/4e7d1618-fbaa-4a18-832e-0632458dc4da" />
<img width="716" height="526" alt="Screenshot 2025-10-31 004303" src="https://github.com/user-attachments/assets/d14ed1d9-96b1-4a0d-9149-9a75869b10f7" />
<img width="775" height="548" alt="Screenshot 2025-10-31 004520" src="https://github.com/user-attachments/assets/80e972dc-adc0-4e78-8973-88ee23dd3302" />
<img width="775" height="550" alt="Screenshot 2025-10-31 004538" src="https://github.com/user-attachments/assets/f53e99ad-1e1e-49d0-8165-69bdf7f2534c" />
4. Menambahkan tabel database dan menyelesaikan wizard hingga `Finish`.  
5. Menulis program untuk menjalankan fungsi: **Insert, Update, Delete, Unggah CSV, Cetak laporan**.
<img width="712" height="270" alt="Screenshot 2025-10-31 004837" src="https://github.com/user-attachments/assets/e551e834-4887-4e5a-9018-25a011251a4d" />
<img width="722" height="342" alt="Screenshot 2025-10-31 005000" src="https://github.com/user-attachments/assets/a4f6b16e-6b00-465c-9f62-355f4dce5eab" />
<img width="753" height="307" alt="Screenshot 2025-10-31 005129" src="https://github.com/user-attachments/assets/e83d3272-221a-456a-8af2-b3140bdf836f" />
<img width="702" height="305" alt="Screenshot 2025-10-31 005904" src="https://github.com/user-attachments/assets/099e965a-9f7d-4570-a70b-bc3bc9e0b1e3" />
<img width="712" height="467" alt="Screenshot 2025-10-31 010002" src="https://github.com/user-attachments/assets/b13c4ace-cca4-4115-971f-d6329dfcb473" />
7. Mempraktikkan tombol GUI, terutama Insert, Update, dan Delete.
<img width="538" height="421" alt="Screenshot 2025-10-31 010652" src="https://github.com/user-attachments/assets/448bc81e-90b1-4e42-ab28-c0d383f15b7a" />
<img width="541" height="422" alt="Screenshot 2025-10-31 010930" src="https://github.com/user-attachments/assets/1893da51-4d8b-458d-9981-1ae54ea5da1c" />
<img width="542" height="425" alt="Screenshot 2025-10-31 010954" src="https://github.com/user-attachments/assets/e75ac34c-2f61-42b0-8441-4cc9bca0e2f0" />
8. Menampilkan detail Java Class
<img width="243" height="222" alt="Screenshot 2025-10-31 012951" src="https://github.com/user-attachments/assets/5bd02985-0c0e-4b35-81fc-6eea4ba95039" />
<img width="478" height="283" alt="Screenshot 2025-10-31 012926" src="https://github.com/user-attachments/assets/e111b643-2a82-4c17-bb39-2798071c53c3" />


---

## 4. Kesimpulan
Berdasarkan pelaksanaan praktikum, dapat ditarik kesimpulan:  
- **Pemahaman JPA dan ORM:** Operasi CRUD dapat dilakukan melalui objek Java tanpa SQL manual.  
- **Penggunaan EntityManager dan Transaksi:** Menjamin konsistensi data saat perubahan database.  
- **Integrasi GUI Swing:** Mempermudah interaksi pengguna dengan data dalam tabel.  
- **Integrasi JasperReports:** Data diolah menjadi laporan otomatis yang profesional.  
- **Manfaat Praktikum:** Memberikan pengalaman langsung dalam pengembangan aplikasi berbasis database, interaksi GUI, dan laporan dinamis.

Secara keseluruhan, praktikum ini menekankan pentingnya pemahaman alur kerja aplikasi berbasis database, dari penyimpanan, manipulasi, hingga penyajian data melalui laporan.

---

## 5. Struktur Proyek
