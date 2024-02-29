package LoginPageApp;

import java.util.*;

//userla ilgili metodlarım burada tanımlanacak
public class UserService {

    public Scanner scanner=new Scanner(System.in);

    public Map<String,String> userInfos=new HashMap<>();//email=password////asd@gmail.com

    //public List<User> users=new ArrayList<>();-->practice

    //2-ad-soyad,email ve şifre bilgisini alarak kaydetme
    public void register(){
        System.out.println("Ad-Soyad giriniz: ");
        String name=scanner.nextLine().trim();

        //email geçersizse tekrar girilmeli
        String email;
        boolean isValid;
        do {
            System.out.println("Email giriniz: ");//asd@gmail.com
            email = scanner.nextLine().trim();
            //email geçerli mi
            isValid=validateEmail(email);//asd@gmail.com
            //bu email ile daha önce kayıt var mı
            boolean isExistsEmail=this.userInfos.containsKey(email);//F
            if (isExistsEmail){
                System.out.println("Bu email ile kayıtlı kullanıcı zaten var!");
                isValid=false;
            }
        }while(!isValid);


        //geçerli şifre alma
        String password;
        boolean isValidPassword;
        do {
            System.out.println("Şifrenizi giriniz:");
            password=scanner.nextLine().trim();
            isValidPassword=validatePassword(password);//Ab1234*

        }while (!isValidPassword);

        //artık kullanıcıyı oluşturalım
        User user=new User(name,email,password);

        //userın bilgilerini sisteme ekleyelim
        this.userInfos.put(user.getEmail(), user.getPassword());

        System.out.println("Tebrikler, kayıt işlemi başarıyla gerçekleşti.");
        System.out.println("Email ve şifrenizi kullanarak sisteme giriş yapabilirsiniz.");

    }

    //3-email ve şifre bilgisi olan kayıtlı üyenin giriş işlemini yapma
    public void login(){


    }


    //4-email doğrulama:ÖDEVVV
    private boolean validateEmail(String email){
        return true;
    }

    //5-password doğrulama:ÖDEVV
    private boolean validatePassword(String password){
        return true;
    }


}
