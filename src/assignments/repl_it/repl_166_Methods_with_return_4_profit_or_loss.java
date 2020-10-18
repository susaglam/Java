package assignments.repl_it;

public class repl_166_Methods_with_return_4_profit_or_loss {

    public String c_profits(int buyPrice, int sellPrice) {
        if (buyPrice < sellPrice) {
            return "profit";
        } else if (buyPrice > sellPrice) {
            return "loss";
        } else if (buyPrice == sellPrice) {
            return "no loss";
        } else {
            return "false";
        }
    }
}
