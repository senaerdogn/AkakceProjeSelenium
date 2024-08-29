# AkakceProjeSelenium
 Selenium-Java ile Akakçe.com sitesi test edilmiştir.
Bu proje, Akakçe web sitesini Selenium kullanarak otomatik olarak test etmek amacıyla oluşturulmuştur. Proje, basit bir arama işlemini gerçekleştirmek ve sonuçları doğrulamak için temel bir test senaryosu içerir.

**Gereksinimler**
Bu projeyi çalıştırabilmek için aşağıdaki gereksinimlere sahip olmanız gerekmektedir:
- Java Development Kit (JDK) 11
- Maven
- Selenium WebDriver
- TestNG

**Testin Çalıştırılması**
Projede yer alan test sınıfı src -> test/java/Akakce -> AkakceTest.java dosyasında bulunur. Testi çalıştırmak için şu adımları izleyebilirsiniz:

Testi Intellij IDEA'da çalıştırın:
- IntelliJ IDEA’yı açın ve başlangıç ekranından "New Project" yerine "Get from Version Control" seçeneğine tıklayın.
- Açılan pencerede "Version Control" olarak "Git" seçeneğini seçin.
- GitHub repository'sinin URL'sini kopyalayıp "URL" alanına yapıştırın.
- Projeyi bilgisayarınıza indireceğiniz yeri seçin ve "Clone" butonuna tıklayın. Proje klonlandıktan sonra, IntelliJ IDEA projeyi otomatik olarak açacaktır.
- IntelliJ pom.xml dosyasını tanıyacak ve gerekli bağımlılıkları indirecektir.
- Proje ayarlarını kontrol etmek için "File" menüsünden "Project Structure" seçeneğine gidin ve proje SDK'sının doğru ayarlandığından emin olun.
- Sol taraftaki proje penceresinde AkakceTest.java sınıfını bulun.
- Sınıfa sağ tıklayın ve "Run 'AkakceTest.java'" seçeneğini seçin.


**Test Sonuçları**
Test sonuçları, test-output klasöründe emailable-report.html dosyası olarak saklanır. Bu dosyayı tarayıcıda açarak test sonuçlarını inceleyebilirsiniz.
Ayrıca raporun ekran görüntüleri Images_Selenium klasörü altında bulunmaktadır.


