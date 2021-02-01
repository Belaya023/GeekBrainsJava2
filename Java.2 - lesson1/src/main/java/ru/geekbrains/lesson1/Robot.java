package ru.geekbrains.lesson1;

public class Robot implements Actions{
    public int robotSpeed;
    public int robotTime;
    public int robotJumpHeight;

    /*public Robot (int robotSpeed, int robotTime, int robotJumpHeight){
        this.robotSpeed = robotSpeed;
        this.robotTime = robotTime;
        this.robotJumpHeight = robotJumpHeight;
    }*/




    @Override
    public boolean run(int robotTime, int robotSpeed) {
        int runLength = robotTime * robotSpeed;
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
    public void jump(int robotJumpHeight) {
        Wall w = new Wall();
        if (w.getHEIGHT()<= robotJumpHeight){
            System.out.println("Стена преодолена!");
        }
        else {
            System.out.println("Испытание стеной не пройдено =(");
        }
    }


}
