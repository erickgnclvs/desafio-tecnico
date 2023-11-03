/*
 * An XML document type.
 * Localname: getSituacoesDeTitulo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSituacoesDeTitulo(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSituacoesDeTituloDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSituacoesDeTituloDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSITUACOESDETITULO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSituacoesDeTitulo");
    
    
    /**
     * Gets the "getSituacoesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.GetSituacoesDeTitulo getGetSituacoesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSituacoesDeTitulo target = null;
            target = (br.jus.tjsc.www.selo.GetSituacoesDeTitulo)get_store().find_element_user(GETSITUACOESDETITULO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSituacoesDeTitulo" element
     */
    public void setGetSituacoesDeTitulo(br.jus.tjsc.www.selo.GetSituacoesDeTitulo getSituacoesDeTitulo)
    {
        generatedSetterHelperImpl(getSituacoesDeTitulo, GETSITUACOESDETITULO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSituacoesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.GetSituacoesDeTitulo addNewGetSituacoesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSituacoesDeTitulo target = null;
            target = (br.jus.tjsc.www.selo.GetSituacoesDeTitulo)get_store().add_element_user(GETSITUACOESDETITULO$0);
            return target;
        }
    }
}
