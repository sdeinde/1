package donem2;

public class Hata1 {

    public static void main(String[] args) {
        try {
            int yas = -5;
            if (yas < 0) {
                // Manuel olarak hata nesnesi oluşturulup fırlatılıyor
                throw new IllegalArgumentException("Yaş Negatif Olamaz!");
            }
        } catch (Exception e) {
            // Fırlatılan hata yakalanıyor ve içindeki mesaj yazdırılıyor
            System.out.println(e.getMessage());
        }
    }
}
