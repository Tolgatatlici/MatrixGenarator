package com.tolga.matrix.service;

import com.tolga.matrix.Matrix;
import org.springframework.stereotype.Service;

@Service
public class MatrixService {


    public int[][] matrixGenerate(Matrix Matrix){

        int[][] values = new int[Matrix.getColumn()][Matrix.getRow()];

        for(int i=0; i < values.length; i++) {
            for (int j=0; j< values[i].length; j++) {
                values[i][j]= (int) (Math.random()* 10);
            }
        }
        return values;
    }
}
