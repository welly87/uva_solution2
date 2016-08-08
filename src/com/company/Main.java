package com.company;

import java.util.Scanner;

public class Main {

    static int m;
    static char[][] map;
    static int [] dx = {1,-1,0,0,1,-1,1,-1};
    static int [] dy = {0,0,1,-1,-1,-1,1,1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            m = sc.nextInt();
            System.out.println(m);
            sc.nextLine();

            map = new char[m][m];

            for (int i = 0; i < m; i++) {
                map[i] = sc.nextLine().toCharArray();
            }

            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == '1') {
                        count++;
                        floodfill(i, j);
                    }
                }
            }

            System.out.println(count);
        }


    }

    private static void floodfill(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= m) return;

        if (map[x][y] != '1') return;

        map[x][y] = '0';

        for (int i = 0; i < dx.length; i++) {
            for (int j = 0; j < dy.length; j++) {
                floodfill(x + dx[i], y + dy[j]);
            }
        }
    }
}
