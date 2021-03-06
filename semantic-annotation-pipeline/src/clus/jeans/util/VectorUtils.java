/*************************************************************************
 * Clus - Software for Predictive Clustering *
 * Copyright (C) 2007 *
 * Katholieke Universiteit Leuven, Leuven, Belgium *
 * Jozef Stefan Institute, Ljubljana, Slovenia *
 * *
 * This program is free software: you can redistribute it and/or modify *
 * it under the terms of the GNU General Public License as published by *
 * the Free Software Foundation, either version 3 of the License, or *
 * (at your option) any later version. *
 * *
 * This program is distributed in the hope that it will be useful, *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the *
 * GNU General Public License for more details. *
 * *
 * You should have received a copy of the GNU General Public License *
 * along with this program. If not, see <http://www.gnu.org/licenses/>. *
 * *
 * Contact information: <http://www.cs.kuleuven.be/~dtai/clus/>. *
 *************************************************************************/

package clus.jeans.util;

import java.util.Vector;


public class VectorUtils {

    public static String[] toStringArray(Vector vec) {
        int size = vec.size();
        String[] array = new String[size];
        for (int i = 0; i < size; i++)
            array[i] = vec.elementAt(i).toString();
        return array;
    }


    public static int[] toIntArray(Vector vec) throws NumberFormatException {
        int size = vec.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = Integer.parseInt(vec.elementAt(i).toString());
        return array;
    }

}
