package ru.geekbrains.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Actions[] aliveArray = new Actions []{new Human(), new Cat(), new Robot()};
        Object[] obstacleArray = new Object[] {new RunningTrack(), new Wall()};
        //RunningTrack track = new RunningTrack();

        for (int i = 0; i < aliveArray.length; i++) {
            for (int j = 0; j < obstacleArray.length; j ++){
                if (obstacleArray[j] == obstacleArray[0]){
                    aliveArray[i].run(10,1);
                }
                else{
                    aliveArray[i].jump(50);
                }
            }

        }

    }
}
