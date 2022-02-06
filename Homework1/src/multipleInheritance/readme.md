### ÇOKLU KALITIM

Java'da çoklu kalıtım olması durumunda,


Class B ve Class C, Class A'dan türeyen yavru sınıflar. Türemenin doğal özelliğini kullanarak print() isimli metodu da overwrite etmiş. D Classı  hem Class B'den hem de Class C'den türüyor. Yani çoklu kalıtım uygulanmış oluyor, türedikten sonra  print() method'unu override etme zorunluluğu olmuyor.  print() methodu son durumda Class B'deki gibi mi yoksa Class C'deki gibi mi davranacağını bilemiyoruz. Bu da bir paradoksa yol açıyor, kalıtımda diamond problemi olarak isimlendiriliyor.

![example](https://user-images.githubusercontent.com/81576354/152664088-aa397ddc-a90e-4ac3-a213-d5220c1a03ea.png)

Buna rağmen, java programlama dilinde arayüz kullanarak (interface) bir sınıfın birden fazla sınıftan miras almasını sağlayabiliriz. İnterface sınıfların içindeki metodlar kesinlikle soyuttur dolayısıyla bu tür sınıflardan türetilen alt sınıflar üst sınıfların aynı isimli isimli metodlarını bulundurmak zorundadır, bu yüzden hangi metodun hangi işi yapacağı zaten alt sınıfta bellidir.

Ancak normal sınıflarda bulunan metodlar soyut olmadığından hangisinin ne iş yapacağı konusu karmaşıklığa yol açar.

Çoklu kalıtımı C++, Perl, Python, Lisp gibi diller destekliyor.
C++'da hangi sınıfın hangi method'unu çağırmak istediğimizi bizzat kendiniz vermeniz gerekiyor. 

