 public class KotoMain extends CoinType {
    private KotoMain() {
        id = "koto.main";

        addressHeader = ?;
        p2shHeader = ?;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = ?;

        family = KotoFamily.get();
        name = "Koto";
        symbol = "KOTO";
        uriScheme = "koto";
        bip44Index = 133;
        unitExponent = ?;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 KOTO mininput
        softDustLimit = value(100000); // 0.001 KOTO
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static KotoMain instance = new KotoMain();
    public static synchronized KotoMain get() {
        return instance;
    }
}
