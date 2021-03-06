/*
 * This file is part of the MLDA.
 *
 * (c)  Jose Maria Moyano Murillo
 *      Eva Lucrecia Gibaja Galindo
 *      Sebastian Ventura Soto <sventura@uco.es>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package mlda.attributes;

import java.util.Set;

import mlda.base.MLDataMetric;
import mulan.data.MultiLabelInstances;
import weka.core.Attribute;

/**
* Class implementing the Number of nominal attributes
*
* @author Jose Maria Moyano Murillo
*/
public class NominalAttributes extends MLDataMetric{

	/**
	 * Constructor
	 */
	public NominalAttributes() {
		super("Number of nominal attributes");
	}
	
	/**
	 * Calculate metric value
	 * 
	 * @param mlData Multi-label dataset to which calculate the metric
	 * @return Value of the metric
	 */
	public double calculate(MultiLabelInstances mlData){
		Set<Attribute> attributeSet = mlData.getFeatureAttributes();
        
        int count = 0;
        
        for(Attribute att : attributeSet){
            if(att.isNominal()){
                count++;
            }
        }
		
		this.value = count;
		return value;
	}

}
