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

package clus.model.modelio.pmml;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class PMMLWriter {

    protected String pmmlcode;


    public PMMLWriter(String pmml) {
        pmmlcode = pmml;
    }


    public void write(String fname) throws IOException {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        // m_Node.printTree(writer, "");
        writer.flush();
    }
}
