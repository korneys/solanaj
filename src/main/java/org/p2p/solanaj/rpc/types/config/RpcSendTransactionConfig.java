package org.p2p.solanaj.rpc.types.config;

import com.squareup.moshi.Json;

public class RpcSendTransactionConfig {

    public static enum Encoding {
        base64("base64"),
        base58("base58");

        private String enc;

        Encoding(String enc) {
            this.enc = enc;
        }

        public String getEncoding() {
            return enc;
        }

    }

    @Json(name = "encoding")
    public Encoding encoding = Encoding.base64;

    @Json(name ="skipPreflight")
    public boolean skipPreFlight = true;

    @Json(name = "maxRetries")
    public long maxRetries = 0;

}
