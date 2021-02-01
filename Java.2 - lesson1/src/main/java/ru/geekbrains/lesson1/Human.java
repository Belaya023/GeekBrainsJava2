package ru.geekbrains.lesson1;

public class Human implements Actions{
    public int humanSpeed;
    public int humanTime;
    public int humanJumpHeight;

    /*public Human (int humanSpeed, int humanTime, int humanJumpHeight){
        this.humanSpeed = humanSpeed;
        this.humanTime = humanTime;
        this.humanJumpHeight = humanJumpHeight;
    }*/

    @Override
    public boolean run(int humanTime, int humanSpeed) {
        int runLength = humanTime * humanSpeed;
        RunningTrack h = new RunningTrack();
        if (h.getLENGTH()<= runLength){
            System.out.println("Беговая дорожка успешно пройдена!");
            return true;
        }
        else {
            System.out.println("Испытание беговой дорожкой провалено =(");
            return false;
        }

    }

    @Override
    public void jump(int humanJumpHeight) {
        Wall w = new Wall();
        if (w.getHEIGHT()<= humanJumpHeight){
            System.out.println("Стена преодолена!");
        }
        else {
            System.out.println("Испытание стеной не пройдено =(");
        }
    }


}
