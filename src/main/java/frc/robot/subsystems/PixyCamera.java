package frc.robot.subsystems;

// import java.util.ArrayList;

// import io.github.pseudoresonance.pixy2api.Pixy2;
// import io.github.pseudoresonance.pixy2api.Pixy2CCC;
// import io.github.pseudoresonance.pixy2api.Pixy2.LinkType;
// import io.github.pseudoresonance.pixy2api.Pixy2CCC.Block;

/**
 * @see //https://github.com/PseudoResonance/Pixy2JavaAPI/wiki/Using-the-API
 */
public class PixyCamera {
    // final Pixy2 pixy;

    // public PixyCamera()
    // {
    //    pixy = Pixy2.createInstance(LinkType.UART);
    //    pixy.init(); // Initializes the camera and prepares to send/receive data
    //    pixy.setLamp((byte) 1, (byte) 1); // Turns the LEDs on
    //    pixy.setLED(0, 255, 0); // Sets the RGB LED to purple
    // }

    // public Block getLargestBlock() {
	// 	// Gets the number of "blocks", identified targets, that match signature 1 on the Pixy2,
	// 	// does not wait for new data if none is available,
	// 	// and limits the number of returned blocks to 25, for a slight increase in efficiency
	// 	final int blockCount = pixy.getCCC().getBlocks(false, Pixy2CCC.CCC_SIG1, 25);
    //     System.out.println("Found " + blockCount + " blocks!"); // Reports number of blocks found
    //     if (blockCount <= 0) {
    //         return null; // If blocks were not found, stop processing
    //     }
    //     final ArrayList<Block> blocks = pixy.getCCC().getBlockCache(); // Gets a list of all blocks found by the Pixy2
    //     Block largestBlock = null;
    //     for (final Block block : blocks) { // Loops through all blocks and finds the widest one
	// 		if (largestBlock == null) {
	// 			largestBlock = block;
	// 		} else if (block.getWidth() > largestBlock.getWidth()) {
	// 			largestBlock = block;
	// 		}
	// 	}
	// 	return largestBlock;
    // }

}