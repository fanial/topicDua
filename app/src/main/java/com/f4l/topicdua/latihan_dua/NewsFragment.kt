package com.f4l.topicdua.latihan_dua

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.f4l.topicdua.R
import com.f4l.topicdua.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {
    lateinit var binding: FragmentNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listNews = arrayListOf(
            DataNews("Berita Persib Bandung: Kondisi Terkini Erwin Ramdani Usai Naik Meja Operasi", "13/09/2022",R.drawable.ic_image_24, "Rafi menyebut, tim medis Persib memutuskan untuk membawa pulang pemain kelahiran 11 Maret 1993 ini ke Bandung untuk menjalani perawatan lebih lanjut. “Setelah dilakukan operasi dan pemberian antibiotik, kami membawa Erwin untuk pulang dan menjalani perawatan di Bandung,” ujar Rafi.", "Arkhelaus Wisnu Triyogo"),
            DataNews("Tarif Ojol Batal Naik Hari Ini Hingga Harga Semen di Papua Meroket Hingga Rp 650 Ribu","13/09/2022",R.drawable.ic_image_24,"Direktur Lalu Lintas Angkutan Jalan Kementerian Perhubungan Suharto menyatakan telah membuat kesepakatan dengan aplikator untuk mengundur pemberlakuan tarif ojek online hingga 11 September 2022." + "\n" +
                    "                \"\\\"Tapi karena jika tarif baru diberlakukan pada waktu tersebut, pasti akan menimbulkan potensi permasalahan di lapangan,\\\" tutur saat dihubungi Tempo, Sabtu, 10 September 2022.", "Rr. Ariyani Yakti Widyastuti"),

        )

        binding.rvNews.adapter = NewsAdapter(listNews)
        binding.rvNews.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}