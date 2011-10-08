/**
 *  Copyright 2011 Health Information Systems Project of India
 *
 *  This file is part of Hospital-core module.
 *
 *  Hospital-core module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Hospital-core module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Hospital-core module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package org.openmrs.module.hospitalcore.util;

import java.util.Comparator;

import org.openmrs.ConceptSet;

public class ConceptSetComparator implements Comparator<ConceptSet>
{

	public int compare(ConceptSet o1, ConceptSet o2) {
		return o1.getConcept().getName().getName().compareTo(o2.getConcept().getName().getName());
	}


}