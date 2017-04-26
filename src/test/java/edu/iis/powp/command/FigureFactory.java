package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Piotr on 26.04.2017.
 */
public class FigureFactory {

    public static PlotterCommand drawRectangle(int x0, int y0, int width, int height) {
        List<PlotterCommand> commands = new ArrayList<>();
        commands.add(new CommandSetPosition(x0, y0));
        commands.add(new CommandDrawLineToPosition(x0 + width, y0));
        commands.add(new CommandDrawLineToPosition(x0 + width, y0 + height));
        commands.add(new CommandDrawLineToPosition(x0, y0 + height));
        commands.add(new CommandDrawLineToPosition(x0, y0));
        return new ComplexCommand(commands);
    }

    public static PlotterCommand drawRightTriangle(int startX, int startY, int firstCathetus, int secondCathetus) {
        List<PlotterCommand> commands = new ArrayList<>();
        commands.add(new CommandSetPosition(startX, startY));
        commands.add(new CommandDrawLineToPosition(startX, startY + firstCathetus));
        commands.add(new CommandDrawLineToPosition(startX + secondCathetus, startY));
        commands.add(new CommandDrawLineToPosition(startX , startY));
        return new ComplexCommand(commands);
    }

}
