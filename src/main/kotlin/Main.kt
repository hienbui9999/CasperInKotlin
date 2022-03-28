import com.casper.sdk.getpeers.GetPeers
import com.casper.sdk.getstateroothash.GetStateRootHash
import net.jemzart.jsonkraken.*

fun main(args: Array<String>) {
    var getStateRootHash:GetStateRootHash = GetStateRootHash()
    getStateRootHash.getStateRootHash()

    var getPeers:GetPeers = GetPeers()
    getPeers.getPeers()
}