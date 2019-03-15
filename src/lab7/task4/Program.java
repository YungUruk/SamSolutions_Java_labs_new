package lab7.task4;

public class Program {
    public static void main(String[] args) {

    }
    enum  RGB{
        black(0,0,0), white(255,255,255), red(255,0,0), green(0,255,0), yellow(255,255,0), blue(0,0,255), pink(255,128,255), gray(192,192,192), brown(128,64,0), orange(255,128,0), purple(128,0,128);
        RGB(int r, int g, int b){

        }
        public String getcolor16(){
            switch (this) {
                case black:return "#000";

                case white:return "#ffffff"; //та кароч это бессмысленно , зачем я тогда объявлял их?

                case red:

                case green:

                case yellow:
                    break;
                case blue:
                    break;
                case pink:
                    break;
                case gray:
                    break;
                case brown:
                    break;
                case orange:
                    break;
                case purple:
                    break;
            }
            return "";

        }
    }
}
