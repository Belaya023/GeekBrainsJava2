package ru.geekbrains.lesson1;

public class Cat implements Actions{
    public int catSpeed;
    public int catTime;
    public int catJumpHeight;

    /*public Cat (int catSpeed, int catTime, int catJumpHeight){
        this.catSpeed = catSpeed;
        this.catTime = catTime;
        this.catJumpHeight = catJumpHeight;
    }*/




    @Override
    public boolean run(int catTime, int catSpeed) {
        int runLength = catTime * catSpeed;
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
    public void jump(int catJumpHeight) {
        Wall w = new Wall();
        if (w.getHEIGHT()<= catJumpHeight){
            System.out.println("Стена преодолена!");
        }
        else {
            System.out.println("Испытание стеной не пройдено =(");
        }
    }


}
