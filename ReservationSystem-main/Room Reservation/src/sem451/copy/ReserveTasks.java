package src.sem451.copy;

import java.util.List;

public interface ReserveTasks {
	boolean reserveBlock(ReserveBlock rb);
	boolean updateBlock(ReserveBlock rb);
	boolean removeBlock(ReserveBlock rb);
	
	void removeAllEndedBlocks();
	void printReservedBlocks(List<ReserveBlock> blocks);

	boolean loadDataFromFile();
	boolean saveDataToFile();
	
}
