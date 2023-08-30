import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class App {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// Using Lambda Expression
		CompletableFuture
				.runAsync(()->{
			        	try {
							TimeUnit.SECONDS.sleep(1); 
						} catch (Exception e) {
					        e.printStackTrace();
					        }
						System.out.println("RUNNING");

					})
				.thenAccept((i)-> {
						System.out.println("LAST ");
					}
				);
		System.out.println("FIRST ");
		//Without a sleep the app is over
		TimeUnit.SECONDS.sleep(3);

		
	}

}
