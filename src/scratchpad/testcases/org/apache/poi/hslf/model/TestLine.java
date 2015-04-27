/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hslf.model;

import java.awt.Color;

import org.apache.poi.hslf.usermodel.HSLFSlide;
import org.apache.poi.hslf.usermodel.HSLFSlideShow;
import org.apache.poi.sl.usermodel.StrokeStyle.LineCompound;
import org.apache.poi.sl.usermodel.StrokeStyle.LineDash;
import org.junit.Test;

/**
 * Test Line shape.
 *
 * @author Yegor Kozlov
 */
public final class TestLine {

    @Test
    public void testCreateLines() {
        HSLFSlideShow ppt = new HSLFSlideShow();

        HSLFSlide slide = ppt.createSlide();

        slide.addTitle().setText("Lines tester");

        Line line;

        /**
         * line styles
         */
        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 200, 300, 0));
        line.setLineCompound(LineCompound.SINGLE);
        line.setLineColor(Color.blue);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 230, 300, 0));
        line.setLineCompound(LineCompound.DOUBLE);
        line.setLineWidth(3.5);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 260, 300, 0));
        line.setLineCompound(LineCompound.TRIPLE);
        line.setLineWidth(6);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 290, 300, 0));
        line.setLineCompound(LineCompound.THICK_THIN);
        line.setLineWidth(4.5);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 320, 300, 0));
        line.setLineCompound(LineCompound.THIN_THICK);
        line.setLineWidth(5.5);
        slide.addShape(line);

        /**
         * line dashing
         */
        line = new Line();
        line.setAnchor(new java.awt.Rectangle(450, 200, 300, 0));
        line.setLineDashing(LineDash.SOLID);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(450, 230, 300, 0));
        line.setLineDashing(LineDash.DASH);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(450, 260, 300, 0));
        line.setLineDashing(LineDash.DOT);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(450, 290, 300, 0));
        line.setLineDashing(LineDash.DASH_DOT);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(450, 320, 300, 0));
        line.setLineDashing(LineDash.LG_DASH_DOT_DOT);
        slide.addShape(line);

        /**
         * Combinations
         */
        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 400, 300, 0));
        line.setLineDashing(LineDash.DASH_DOT);
        line.setLineCompound(LineCompound.TRIPLE);
        line.setLineWidth(5.0);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 430, 300, 0));
        line.setLineDashing(LineDash.DASH);
        line.setLineCompound(LineCompound.THICK_THIN);
        line.setLineWidth(4.0);
        slide.addShape(line);

        line = new Line();
        line.setAnchor(new java.awt.Rectangle(75, 460, 300, 0));
        line.setLineDashing(LineDash.DOT);
        line.setLineCompound(LineCompound.DOUBLE);
        line.setLineWidth(8.0);
        slide.addShape(line);
    }
}
