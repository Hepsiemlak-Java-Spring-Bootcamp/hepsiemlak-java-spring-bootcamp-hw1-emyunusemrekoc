### MODEL

CorporateUser, IndividualUser ve Admin User sınıfını extend ediyor. Çünkü hepsinin belli ortak özellikleri var, mail şifre fotoğraf vb gibi. Bu şekilde tasarımını yaparak ekle çıkar işlemini de kolaylaştırmış oluyoruz.

Advertisement sınıfında City, District , HomeType (Daire,Villa, Köşk vs.), AdvertisementType(Günlük, Kiralık, Satılık vs) gibi sınıflar bulunuyor. Bu şekilde dizayn ederek daha parametrik bir yapı oluşturduğumu düşünüyorum. Yeni bir ilan tipi eklenmek istediği zaman bunu kolaylıkla yapabiliyoruz.

Maindeki methodları ise parametrik oluşturmaya çalıştım, böylelikle daha az sayıda methoda ihtiyacımız oldu.

Çıktılar png olarak paylaşıldı.