package org.oscim.layers.tile.vector.labeling;

import org.oscim.renderer.bucket.SymbolItem;
import org.oscim.utils.geom.OBB2D;

public class Symbol extends SymbolItem {
    SymbolItem item;
    public int w;
    public int h;
    public OBB2D bbox;

    int tileX;
    int tileY;
    int tileZ;

    public int active;

    public Symbol clone(SymbolItem si) {
        this.bitmap = si.bitmap;
        this.texRegion = si.texRegion;
        this.billboard = si.billboard;
        this.merge = si.merge;
        return this;
    }
}
