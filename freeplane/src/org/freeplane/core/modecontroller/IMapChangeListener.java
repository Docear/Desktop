/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2008 Dimitry Polivaev
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
package org.freeplane.core.modecontroller;

import org.freeplane.core.model.NodeModel;

/**
 * @author Dimitry Polivaev
 */
public interface IMapChangeListener {
	public void mapChanged(MapChangeEvent event);

	void onNodeDeleted(NodeModel parent, NodeModel child, int index);

	void onNodeInserted(NodeModel parent, NodeModel child, int newIndex);

	void onNodeMoved(NodeModel oldParent, int oldIndex, NodeModel newParent, NodeModel child, int newIndex);

	void onPreNodeDelete(NodeModel oldParent, NodeModel selectedNode, int index);
}
