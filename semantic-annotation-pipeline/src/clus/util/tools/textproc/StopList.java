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

package clus.util.tools.textproc;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Hashtable;

import clus.main.Settings;


public class StopList extends Hashtable {

    public final static long serialVersionUID = Settings.SERIAL_VERSION_ID;


    public StopList() {
        super();
    }


    public StopList(String filename) throws IOException {
        String dummy = "";
        LineNumberReader reader = new LineNumberReader(new FileReader(filename));
        while (true) {
            String word = reader.readLine();
            if (word == null)
                break;
            put(word, dummy);
        }
        reader.close();
    }


    public boolean hasWord(String word) {
        return containsKey(word);
    }
}
