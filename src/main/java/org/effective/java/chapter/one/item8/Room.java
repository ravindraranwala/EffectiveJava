package org.effective.java.chapter.one.item8;

import java.lang.ref.Cleaner;

//An autocloseable class using a cleaner as a safety net
public class Room implements AutoCloseable {
	private static final Cleaner cleaner = Cleaner.create();

	private static class State implements Runnable {
		int numJunkPiles; // Number of junk piles in this room

		State(int numJunkPiles) {
			this.numJunkPiles = numJunkPiles;
		}

		// Invoked by close method or cleaner
		public void run() {
			System.out.println("Cleaning room");
			numJunkPiles = 0;
		}

	}

	// The state of this room, shared with our cleanable
	private final State state;

	// Our cleanable. Cleans the room when it’s eligible for gc
	private final Cleaner.Cleanable cleanable;

	public Room(int numJunkPiles) {
		state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	public void close() throws Exception {
		cleanable.clean();
	}

}
