var styleList = [
    { style: 'date', pattern: /([0-9]{1,2}\.[0-9]{1,2} )?([0-9]{2}:){2}[0-9]{2}/g },
    { style: 'col-black', pattern: /(§|\?)0.+/g },
    { style: 'col-dblue', pattern: /(§|\?)1.+/g },
    { style: 'col-dgreen', pattern: /(§|\?)2.+/g },
    { style: 'col-daqua', pattern: /(§|\?)3.+/g },
    { style: 'col-dred', pattern: /(§|\?)4.+/g },
    { style: 'col-dpurple', pattern: /(§|\?)5.+/g },
    { style: 'col-gold', pattern: /(§|\?)6.+/g },
    { style: 'col-gray', pattern: /(§|\?)7.+/g },
    { style: 'col-dgray', pattern: /(§|\?)8.+/g },
    { style: 'col-blue', pattern: /(§|\?)9.+/g },
    { style: 'col-green', pattern: /(§|\?)a.+/g },
    { style: 'col-aqua', pattern: /(§|\?)b.+/g },
    { style: 'col-red', pattern: /(§|\?)c.+/g },
    { style: 'col-lpurple', pattern: /(§|\?)d.+/g },
    { style: 'col-yellow', pattern: /(§|\?)e.+/g },
    { style: 'col-white', pattern: /(§|\?)f.+/g },
    { style: 'col-obfuscated', pattern: /(§|\?)k.+/g },
    { style: 'col-bold', pattern: /(§|\?)l.+/g },
    { style: 'col-strike', pattern: /(§|\?)m.+/g },
    { style: 'col-underline', pattern: /(§|\?)n.+/g },
    { style: 'col-italic', pattern: /(§|\?)o.+/g },
    { style: 'hide', pattern: /(§|\?)[\w\d]/g },
    { style: 'connection', pattern: /Player .+connected.+ /g }, // Connect/disconnect
    { style: 'source-multicraft', pattern: /\[(Multicraft|Setup\/"[^"]+[^\]]+)\]/g },
    { style: 'source-server', pattern: /\[Server\]/g },
    { style: 'source-connection', pattern: /\[(Dis)?(C|c)onnect\]/g },
    { style: 'level-info', pattern: /(Server (\w+ )?(t|T)hread\/)?INFO /g },
    { style: 'level-warning', pattern: /(Server (\w+ )?(t|T)hread\/)?(ERROR|WARN(ING)?) /g },
    { style: 'level-severe', pattern: /(Server (\w+ )?(t|T)hread\/)?SEVERE /g },
];

$(document).ready(function() {
    var pressed = false,
        $log = $("#log-ajax"),
        first_run = true,
        last_line = null;

    $log.on('mousedown', function () {
        pressed = true;
    }).on('mouseup', function () {
        pressed = false;
    });

    $log.change(function(e, val) {
        if (pressed) {
            return false;
        }

        if (first_run) {
            $log.text('');
        }

        var newval       = "",
            lines        = val.split(/\r?\n/),
            new_line     = lines[0],
            start_height = $log.prop('scrollHeight');

        for (var i = 0; i < lines.length; i++) {
            if (lines[i] === last_line) {
                break;
            }

            var replace = function (m) {
                return '<span class="console-' + styleList[j].style + '">' + m + '</span>';
            };
            lines[i] = $('<span>').text(lines[i]).html();
            for (var j = 0, l = styleList.length; j < l; j++) {
                lines[i] = lines[i].replace(styleList[j].pattern, replace);
            }
            if ($('#log_bottomup').text() != "true")
                newval += lines[i] + "\n";
            else
                newval = lines[i] + "\n" + newval;
        }
        first_run = false;
        last_line = new_line;

        if ($('#log_bottomup').text() != "true") {
            $log.prepend(newval);
            if ($log.scrollTop() > 50)
                $log.scrollTop($log.scrollTop() + ($log.prop('scrollHeight') - start_height));
        } else {
            var scroll = ($log.scrollTop() > ($log.prop('scrollHeight') - $log.height() - 50));
            $log.append(newval);
            if (scroll)
                $log.scrollTop($log.prop('scrollHeight'));
        }

    });
    $log.trigger("change", $log.text());
});
