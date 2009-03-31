/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2009 Dimitry Polivaev
 *
 *  This file author is Dimitry Polivaev
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeplane.features.common.link;

import org.freeplane.core.filter.condition.ConditionFactory;
import org.freeplane.core.resources.FreeplaneResourceBundle;

/**
 * @author Dimitry Polivaev
 * Mar 7, 2009
 */
public class HyperLinkContainsCondition extends HyperLinkCondition {
	public static final String NAME = "hyper_link_contains";

	public HyperLinkContainsCondition(final String hyperlink) {
		super(hyperlink);
	}

	@Override
	protected boolean checkLink(final String nodeLink) {
		return nodeLink.contains(getHyperlink());
	}

	@Override
	protected String createDesctiption() {
		final String condition = FreeplaneResourceBundle.getText(LinkConditionController.FILTER_LINK);
		final String simpleCondition = FreeplaneResourceBundle.getText(ConditionFactory.FILTER_CONTAINS);
		return ConditionFactory.createDescription(condition, simpleCondition, getHyperlink(), false);
	}

	@Override
	String getName() {
		return NAME;
	}
}
