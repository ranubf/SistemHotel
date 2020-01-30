# Keamanan Program Lanjutan
## Dokumentasi Tugas Akhir Semester
### Bio Akram, Ircham Aji Nugroho, Lytio Enggar Erlangga, Rafif Masrur Rauf, Ranu Barta Fahrizal

- - - -

#### BAB 1 <br> SKENARIO
##### 1.1 Deskripsi Sistem

Aplikasi pemesanan hotel merupakan aplikasi berbasis desktop dengan menggunakan bahasa Java dan database MySQL. Aplikasi pemesanan hotel terdiri dari fitur pemesanan kamar dan perekapan kamar. Fitur pemesanan kamar digunakan untuk melakukan pendataan kamar yang dipesan oleh konsumen dengan menginputkan nama, jenis kelamin, alamat, dan jenis kamar serta akan mencetak struk dengan format `.xml`. Kamar yang telah dipesan dapat dilihat pada fitur perekapan kamar dengan menambahkan detail nomor struk, harga dan tanggal. Kamar yang telah dipesan dan masuk ke rekapan kamar dapat dilakukan pengeditan dan penghapusan data dengan menekan tombol edit maupun hapus.

##### 1.2 Tujuan Sistem
Tujuan dibuatnya aplikasi adalah memudahkan pencatatan pemesanan kamar dan melakukan perekapan pemesanan kamar sehingga dapat mengefektifkan proses pemesanan kamar pada hotel.

##### 1.3 Model Aplikasi

Ketika aplikasi dijalankan maka user akan diminta untuk memasukkan username dan password pada form seperti pada gambar 1. Sebelum masuk ke halaman utama.
![Form Login](https://user-images.githubusercontent.com/58713915/73421099-51188a80-4357-11ea-9f81-0e9a775be51f.png)
<br> Gambar 1.3.1 Form Login

Setelah berhasil login, maka user akan masuk ke halaman utama yang tersedia fitur pesan kamar dengan menekan tombol pesan kamar dan fitur rekap kamar dengan cara menekan tombol rekap kamar seperti pada gambar 2.
<br> ![Halaman Utama](https://user-images.githubusercontent.com/58713915/73421101-51188a80-4357-11ea-8d9b-ccc13d7d2291.png)
<br> Gambar 1.3.2 Halaman Utama

Untuk melakukan pemesanan kamar user harus memasukkan nama, jenis kelamin, alamat, dan jenis kamar kemudian menekan tombol pesan. Apabila ingin membatalkan pesanan klik tombol batal. Apabila berhasil akan muncul notifikasi seperti pada gambar 4.
<br> ![Form Pesan Kamar](https://user-images.githubusercontent.com/58713915/73421103-51b12100-4357-11ea-9782-7e08f1699f80.png)
<br> Gambar 1.3.3 Form Pesan Kamar
<br> ![Notifikasi Pemesanan Berhasil](https://user-images.githubusercontent.com/58713915/73421105-5249b780-4357-11ea-9692-98d2e45fa1a2.png)
<br> Gambar 1.3.4 Notifikasi Pemesanan Berhasil

Selain fitur pesan kamar, terdapat fitur rekap pesanan kamar yang akan menampilkan nomor faktur, tanggal pesanan, nama pemesan, jenis kelamin, alamat, jenis kamar dan harga. Apaila ingin melakukan edit terhadap list pesanan klik tombol edit. Apabila ingin menghapus klik tombol hapus. Setelah dilakukan pengeditan atau penghapusan akan keluar pop up konfirmasi seperti pada gambar 6.
<br> ![Rekap Pemesanan](https://user-images.githubusercontent.com/58713915/73421109-5249b780-4357-11ea-9a9f-0ac5500d82a6.png)
<br> Gambar 1.3.5 Rekap Pemesanan
<br> ![Konfirmasi Penghapusan Data Pemesanan](https://user-images.githubusercontent.com/58713915/73421110-52e24e00-4357-11ea-81e9-f0d36e432330.png)
<br> Gambar 1.3.6 Konfirmasi Penghapusan Data Pemesanan

#### BAB 2 <br> INSTALASI
##### 2.1 Perangkat Lunak
Perangkat lunak yang dibutuhkan untuk menjalankan aplikasi Pemesanan Hotel minimal memiliki spesifikasi sebagai berikut:

* Sistem Operasi Windows 10
* Java Runtime Environment
* Java Development Kit 1.8
* Integrated Development Environment
* MySQL JDBC Driver
* rs2xml.jar
* XAMPP

##### 2.2 Perangkat Keras
Perangkat keras yang dibutuhkan untuk menjalankan aplikasi Pemesanan Hotel minimal memiliki spesifikasi sebagai berikut:

* CPU atau laptop
* Mouse atau touchpad
* Monitor
* Keyboard

##### 2.3 Pengguna Aplikasi
Pengguna aplikasi yang dimaksud adalah manusia yang akan menggunakan aplikasi dan memiliki pemahaman antar muka komputer.

#### BAB 3 <br> ATTACK
##### 3.1 Tipe Attack
Dalam aplikasi ini, tipe attack yang ada berupa _SQL Injection_, _XML Injection_, _Validation Input_, _Integer Overflow_, dan _Unsanitized User Input Log_.

##### 3.2 Threat Model

Dalam aplikasi ini, threat model pada serangan _SQL Injection_ sebagai berikut
<br> ![Threat Model _SQL Injection_](https://user-images.githubusercontent.com/58713915/73421444-6fcb5100-4358-11ea-926b-adfbfd2b03a1.png)
<br> Gambar 3.2.1 Threat Model _SQL Injection_

Dalam aplikasi ini, threat model pada serangan _XML Injection_ sebagai berikut
<br> ![Threat Model _XML Injection_](https://user-images.githubusercontent.com/58713915/73426561-40701080-4367-11ea-980f-400b368056ff.png)
<br> Gambar 3.2.2 Threat Model _XML Injection_

Dalam aplikasi ini, threat model pada serangan _Validation Input_ sebagai berikut
<br> ![Threat Model _Validation Input_](https://user-images.githubusercontent.com/58713915/73426969-4adeda00-4368-11ea-8658-d3e7f9c620ad.png)
<br> Gambar 3.2.3 Threat Model _Validation Input_

Dalam aplikasi ini, threat model pada serangan _Integer Overflow_ sebagai berikut
<br> ![Threat Model _Integer Overflow_](https://user-images.githubusercontent.com/58713915/73426560-3fd77a00-4367-11ea-8191-775e51c9d9df.png)
<br> Gambar 3.2.4 Threat Model _Integer Overflow_

Dalam aplikasi ini, threat model pada serangan _Unsanitized User Input Log_ sebagai berikut
<br> ![Threat Model _Unsanitized User Input Log_](https://user-images.githubusercontent.com/58713915/73427221-e1130000-4368-11ea-8d77-a253bea58acd.png)
<br> Gambar 3.2.5 Threat Model _Unsanitized User Input Log_

##### 3.3 Attack Vector

Dalam aplikasi ini, attack vector yang digunakan dalam serangan _SQL Injection_ dan _Unsanitized User Input Log_ terdapat pada halaman login (`loginform.java`). Serangan _XML Injection_, _Validation Input_, dan _Integer Overflow_ terdapat pada halaman pesan kamar (`PesanKamar.java`).

##### 3.4 Eksekusi Attack

Serangan _SQL Injection_ dapat dilakukan pada halaman login (`loginform.java`) dengan menggunakan payload `admin';#` (kata _admin_ digunakan karena terdapat username tersebut dalam database, dengan kata lain terdapat sebuah kondisi yaitu perlu diketahui sebuah username dalam database) pada kolom username dan sebarang karakter pada kolom password. Serangan _Unsanitized User Input Log_ dapat terjadi karena tidak melakukan sanitasi input sehingga dapat mempengaruhi data log dari pengguna yang masuk ke dalam program, dan dapat menyebabkan _sensitive information disclosure_ dengan payload `admin';#`.
Serangan _XML Injection_ dapat dilakukan pada halaman pesan kamar (`PesanKamar.java`) pada kolom alamat dengan payload yang dapat disesuaikan untuk mengubah nilai dari harga kamar seperti `1` dan akan tereksekusi saat melakukan penyimpanan dan menghasilkan file XML sebagai bentuk struk dengan format `.xml`. Serangan _Validation Input_ dapat terjadi kolom nama pada halaman yang sama, sehingga nama dari pemesan kamar dapat
diisi dengan angka maupun spesial karakter lainnya seperti contohnya `1111`. Serangan _Integer Overflow_ dapat terjadi pada kolom durasi menginap pada halaman yang sama, yaitu dengan payload angka diatas batas dari tipe data seperti `99999999`.

#### BAB 4 <br> MITIGASI
##### 4.1 Tipe Vulnerability

Serangan _SQL Injection_ merupakan tipe vulnerability _Improper Neutralization of Special Elements used in an SQL Command_ (_'SQL Injection'_), sesuai dengan nomor CWE-89, ISO/IEC TR 24772:2010 tentang Injection [RST], dan CWE-116 yaitu _Improper encoding or escaping of output_. _XML Injection_ merupakan tipe _XML Injection_ atau _Blind XPath Injection_ dengan nomor CWE-91, ISO/IEC TR 24772:2010 tentang Injection, dan CWE-116 yaitu _Improper encoding or escaping of output_. _Validation Input_ dengan tipe vulnerability _Improper Input Validation_ sesuai dengan CWE-20. _Integer Overflow_ adalah vulnerability dengan tipe _Integer Overflow or Wraparound_ dengan nomor CWE-190, dan ISO/IEC TR 24772:2010 Wrap-around Error [XYY]. _Unsanitized User Input Log_ adalah vulnerability dengan tipe _Improper neutralization of escape, meta, or control sequences_ dengan nomor CWE-150, _Improper neutralization of line delimiters_ dengan nomor CWE-144, serta ISO/IEC TR 24772:2010 tentang Injection [RST].

##### 4.2 Mitigasi

Serangan _SQL Injection_ dapat dicegah dengan beberapa cara, antara lain menggunakan class `PreparedStatement`, _whitelisting_, dan validasi input berupa membandingkan nilai yang menggunakan class `ResultSet` untuk mengeksekusi command SQL dengan nilai yang dimasukkan. _XML Injection_ dapat dihindari dengan _whitelisting_ dan XML Schema. Kerawanan _Validation Input_ dapat dihindari dengan melakukan _whitelisting_ yang menggunakan class `Pattern`. _Integer Overflow_ or Wrapararound dapat dihindari dengan cara _precondition testing_, _Upcasting_, dan menggunakan tipe data `BigInteger`. _Unsanitized User Input Log_ dicegah dengan cara sanitasi input.

##### 4.3 Pembahasan

Kerawanan _SQL Injection_ yang berada pada halaman login (`loginform.java`) dapat terjadi karena beberapa hal, yaitu antara lain: tidak melakukan sanitasi input (pada kolom username), tidak melakukan pengecekan kesesuaian username dan password (yang ada dalam database), tidak menggunakan class `PreparedStatement` (yang digunakan untuk sanitasi input dari data yang tidak dipercaya). Kerawanan _XML Injection_ terjadi pada halaman pesan kamar (`PesanKamar.java`) dapat terjadi karena tidak melakukan sanitasi input (pada kolom alamat), dan tidak menggunakan XML Schema dalam membangkitkan file `struk.xml`. Kerawanan _Validation Input_ terjadi kolom nama pada halaman pesan kamar. Kerawanan ini dapat terjadi karena dari tidak melakukan sanitasi input, sehingga nama dari pemesan kamar dapat menggunakan nomor (yang mana hal ini seharusnya tidak boleh terjadi dalam kasus pemesanan kamar hotel). Kerawanan _Integer Overflow_ terjadi karena beberapa hal, seperti: tidak melakukan pembatasan jumlah karakter yang dimasukkan (_character delimiter_), dan tidak membatasi jumlah nilai inputan yang dimasukkan sehingga nilai yang dimasukkan dapat melebihi batas dari tipe data yang digunakan. Kerawanan _Unsanitized User Input Log_ terjadi karena tidak melakukan sanitasi input dalam penyimpanan log dari aktivitas yang dilakukan. Hal ini menjadi kerawanan karena apabila yang input yang masuk berupa sebuah injection, maka dapat berujung pada _sensitive information disclosure_ yang dapat digunakan sebagai patokan untuk melakukan serangan berikutnya.

##### 4.4 Apply Patch

_SQL Injection_ dapat dicegah salah satunya dengan cara melakukan pengecekan kesesuaian username dan password dan menggunakan class `PreparedStatement`, dengan contoh source code sebagai berikut:
<br> ![Pengecekan Username dan Password](https://user-images.githubusercontent.com/58713915/73421112-537ae480-4357-11ea-996f-c16bc51c5c7e.PNG)<br> Gambar 4.4.1 Pengecekan Username dan Password
<br> ![Menggunakan Class `PreparedStatement`](https://user-images.githubusercontent.com/58713915/73421115-54137b00-4357-11ea-9f1e-79495a5408b8.PNG)
<br> Gambar 4.4.2 Menggunakan class `PreparedStatement`

_XML Injection, Validation Input, dan Integer Overflow_ yang berada dalam halaman yang sama (`PesanKamar.java`) dapat dicegah salah satunya dengan cara melakukan _whitelisting_/sanitasi terhadap karakter yang dapat dimasukkan dalam tiap kolom dengan menggunakan class `Pattern`, contohnya sebagai berikut:
<br> ![Melakukan sanitasi](https://user-images.githubusercontent.com/58713915/73421118-54ac1180-4357-11ea-916d-adf5405b5db4.PNG)
<br> Gambar 4.4.3 Menggunakan class `Pattern`

_Unsanitized User Input Log_ dapat dicegah salah satunya dengan cara _whitelisting_/sanitasi yang menggunakan class `Pattern` dengan tujuan untuk tidak ada karakter yang tidak diinginkan masuk kedalam database, sehingga tidak terjadinya _sensitive information disclosure_ serta contohnya sebagai berikut:
<br> ![Melakukan sanitasi](https://user-images.githubusercontent.com/58713915/73421098-507ff400-4357-11ea-91d7-6f082d1fd169.PNG)
<br> Gambar 4.4.4 Menggunakan class `Pattern`
