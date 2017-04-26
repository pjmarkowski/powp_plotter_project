package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

/**
 * Created by Piotr on 20.04.2017.
 */
public class ComplexCommand implements PlotterCommand{

    private List<PlotterCommand> commands;


    public ComplexCommand(List<PlotterCommand> commands) {
        this.commands = commands;
    }

    @Override public void execute(IPlotter iPlotter) {
        commands.forEach(command -> command.execute(iPlotter));
    }
}
