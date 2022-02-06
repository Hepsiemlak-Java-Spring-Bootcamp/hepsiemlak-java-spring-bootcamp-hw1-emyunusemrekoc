### MODEL

CorporateUser, IndividualUser ve Admin User sınıfını extend ediyor. Çünkü hepsinin belli ortak özellikleri var, mail şifre fotoğraf vb gibi. Bu şekilde tasarımını yaparak ekle çıkar işlemini de kolaylaştırmış oluyoruz.

![Package model without dependencies](https://user-images.githubusercontent.com/81576354/152664152-db99009b-3330-43cd-9f42-caa9dd2fb023.png)

Advertisement sınıfında City, District , HomeType (Daire,Villa, Köşk vs.), AdvertisementType(Günlük, Kiralık, Satılık vs) gibi sınıflar bulunuyor. Bu şekilde dizayn ederek daha parametrik bir yapı oluşturduğumu düşünüyorum. Yeni bir ilan tipi eklenmek istediği zaman bunu kolaylıkla yapabiliyoruz.

Maindeki methodları ise parametrik oluşturmaya çalıştım, böylelikle daha az sayıda methoda ihtiyacımız oldu.

Çıktılar png olarak paylaşıldı.

![ılanları_listele(2+1,3+1,3000)](https://user-images.githubusercontent.com/81576354/152664137-738ebb61-c1be-4fa4-b75b-f7d8cf04b339.png)
![tum_mesajlar](https://user-images.githubusercontent.com/81576354/152664139-b6c7b22f-39e5-4f37-8541-1435404b115a.png)
![maile_gore](https://user-images.githubusercontent.com/81576354/152664141-d219a08c-8bbc-42fb-b477-a03f697b0e48.png)


![Package model](https://user-images.githubusercontent.com/81576354/152664189-5ad38084-c9c4-4641-92d6-f268a90951c5.png)
