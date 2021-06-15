fun main(){
    val audioDownloader:Downloader = Audio("a.mp3")
    val videoDownloader:Downloader = Video("a.mp4")
    audioDownloader.download()
    videoDownloader.download()
}