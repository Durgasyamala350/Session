package shopping;
import org.springframework.context.annotation.*;
@Configuration
public class ConfigurationClass {
	
	@Bean
	public ShoppingCard shoppingCard()
	{
	return new ShoppingCard(12345,"SBI");
	}
	@Bean
	public Item item()
	{
	return new Item("IceCream",100);
	}
	}



